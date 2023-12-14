package Classes;

public class Person {
    private int id;
    private String fio;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public Person(int id, String fio, Long cardNumber, Long hashPass, String login){
        this.id = id;
        this.fio = fio;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }

    public int getId(){
        return this.id;
    }
    public String getFio(){
        return this.fio;
    }
    public Long getHashPass(){
        return this.hashPass;
    }
    public void setHashPass(Long hashPass){
        this.hashPass = hashPass;
    }
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
}
