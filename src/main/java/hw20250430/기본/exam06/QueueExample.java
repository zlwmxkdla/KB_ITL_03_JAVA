package hw20250430.exam06;

import hw20250430.exam02.Member;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> q = new LinkedList<>();
        q.offer(new Message("sendMail","홍길동"));
        q.offer(new Message("sendSMS","신용권"));
        q.offer(new Message("sendKkao","감자바"));

        while(!q.isEmpty()){
            Message m = q.poll();
            switch(m.command){
                case "sendMail":
                    System.out.println(m.to+"님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(m.to+"님에게 SMS를 보냅니다.");
                    break;
                case "sendKkao":
                    System.out.println(m.to+"님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
