package model;

public class Student {

    private String name;//jebkuram studentam bus vards
    private String surname;//jebkuram studentam bus vards
    private String personcode;//jebkuram studentam bus personas kods
    private int matricularNr;//jebkuram sutdentam bus matrikulas nummmurs
    private String email;//jebkuram studentam bus epasts
    private int number;//jebkuram studentam bus telefon number
    private byte age;//jebkuram studentam bus vecums,registracijas bridi.
    private boolean DidUserCollectTheTastyCookies;//jebkuram studentam vajag cookies


    //veidosim ipasu funkciju - konstructor(bez datu tipa un bez void)

    public Student(String inputName,String inputSurname,String inputpersoncode,int inputmatricularNr,String inputemail,int inputnumber,
        byte intputage,boolean intputDiduserCollectTheTastyCookies){

            
            
            
            name = inputName;
            surname = inputSurname;
            personcode = inputpersoncode;
            matricularNr = inputmatricularNr;
            email = inputemail;
            number = inputnumber;
            age = intputage;
            DidUserCollectTheTastyCookies = intputDiduserCollectTheTastyCookies;


        }



        //toString funkcija - datu apvienosanas viena string virkne


        public String toString(){

            String result = name + " " + surname + "(" + personcode + ")" + email + " , " + number + " [ " + matricularNr + "]"
             + age + ", Did user collect cookies" + DidUserCollectTheTastyCookies;
             
            return result;




        }
    }
