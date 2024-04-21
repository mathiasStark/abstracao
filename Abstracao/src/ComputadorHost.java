import apps.Facebook;
import apps.ServicoMensagens;
import apps.Telegram;
import apps.Whatsapp;

import java.util.Scanner;

public class ComputadorHost {
    public static void main(String[] args) {
        ServicoMensagens sms = null;
        Scanner sr = new Scanner(System.in);
        System.out.println("Escolha o app: tlg, wts ou fcb");
        String app = sr.next();

       try{
           if(app.equals("tlg"))
               sms = new Telegram();
           if(app.equals("fcb"))
               sms = new Facebook();
           if(app.equals("wts"))
               sms = new Whatsapp();

           sms.enviarMensagem();
           sms.receberMensagem();
       } catch(Exception e) {
           e.printStackTrace();
       }

    }
}
