package atividades.datas;

public class App {
    
    public static void main(String[] args) {
        Datas d1 = new Datas(20, 05, 2024);
        Datas d2 = new Datas(19, 05, 2024);
        String d3 = d1.converteParaString();
        
        System.out.println(d1.diaPosterior(d2));
        System.out.println(d3);

    }
}
