/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaiPTB2
{
    float a,b,c;
    double delta;
    float x1,x2;
    boolean conghiem = false;
    
    public GiaiPTB2(float a,float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    
    String Giai(){
        String sResult="";
        if(a==0)//phương trình bậc nhất
        {
            if(b==0)
            {
                if(c==0)
                    sResult="Phương trình vô số nghiệm.";
                else //c!=0
                    sResult="Phương trình vô nghiệm.";
            }
            else //b!=0 //Bx = -C
            {
                x1 = x2 = -c/b;
                conghiem = true;    
            }
        }
        // truong hop a!=0
        //Phương trình bậc hai
        delta = TinhDelta();
        if(delta <0)
            sResult="Phương trình vô nghiệm.";
        else
        {
            if(delta == 0)
            {
                x1 = x2 = -b/(2*a);
                conghiem = true;
                sResult="Nghiệm x1=x2=" + x1;
            }
            else
            {
                x1 = (float)((-b + Math.sqrt(delta))/(2*a));
                x2 = (float)((-b - Math.sqrt(delta))/(2*a));
                conghiem = true;
                sResult="Nghiệm x1=" + x1 + ", x2=" + x2;
            }
        }
        return sResult;
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////
    double TinhDelta()
    {
        return (b*b - 4*a*c);
    }
}
