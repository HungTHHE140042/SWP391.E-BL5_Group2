/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import dao.SubscribeDAO;
import entity.Subscribe;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import smtp.Email;

/**
 *
 * @author trinh
 */
public class SendEmail {
    public static void sendEmailToSubscriber(String title, String content) throws MessagingException{
        List<Subscribe> listSubs = new ArrayList<>();
        SubscribeDAO sDAO = new SubscribeDAO();
        listSubs = sDAO.getAllSubscribe();
        for (Subscribe sub : listSubs) {
            Email.sendEmail(sub.getEmail(), title, content);
        }
    }
}
