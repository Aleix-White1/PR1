package uoc.ds.pr.model;

import java.time.LocalDate;

public class Worker {

    private String id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Qualification qualification;

    public Worker(String id, String name, String surname, LocalDate dateOfBirth, Qualification qualification){
            this.setId(id);
            this.setName(name);
            this.setSurname(surname);
            this.setDateOfBirth(dateOfBirth);
            this.setQualification(qualification);
    }
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){this.name = name;}

    public void setSurname(String surname){this.surname = surname;}

    public void setDateOfBirth(LocalDate dateOfBirth){this.dateOfBirth = dateOfBirth;}

    public void  setQualification(Qualification qualification){this.qualification = qualification;}

    public String getId(String id){return id;}
    public String getName(String name){return name;}
    public String getSurname(String surname){return surname;}
    public LocalDate getDateOfBirth(LocalDate dateOfBirth){return dateOfBirth;}
    public Qualification qualification(Qualification qualification){return qualification;}


}
