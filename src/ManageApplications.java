import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ManageApplications {
    LinkedList<Tenants> list = new LinkedList<>();
    ArrayList<Maintenance> request = new ArrayList<>();

    public void createRequest(Maintenance needs){
        request.add(needs);
    }

    public void create(Tenants applications){
        list.add(applications);
    }

    public Tenants read(String name){
        for (Tenants application: list) {
            if (application.getFname().equals(name))
                return application;
        }
        return null;
    }

    public void update(String name){
        Tenants apps = read(name);
        if (name != null){
            System.out.println("What is your new credit score?");
            Scanner scans = new Scanner(System.in);
            int score = scans.nextInt();
            apps.setCreditScore(score);
        }
    }
    public void delete(String name){
        Tenants apps = read(name);
        if (name != null){
            list.remove(apps);
            System.out.println("We have deleted your application.");
        }
    }

    public void display(){
        for (Maintenance need: request) {
            System.out.println(need.toString());
        }
    }
}
