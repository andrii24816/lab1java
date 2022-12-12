
package org.example;

import java.util.Objects;

public class People{
    private static final String NAME = "People";

     String Name;
     long Number;
     int LeaseTerm;
     long CodeP;


    public  String GetName() {
        return Name;
    }
    public void SetName(String Name) {
        this.Name = Name;
    }


    public long GetCodeP() {
        return CodeP;
    }

    public long GetNumber() {
        return Number;
    }
    public void SetNumber(long Number) {
        this.Number = Number;
    }

    public int GetLeaseTerm() {
        return LeaseTerm;
    }

    public void SetLeaseTerm(int LeaseTerm) {
        this.LeaseTerm = LeaseTerm;
    }

    @Override
    public String toString(){
        return "Info{ " +
                "Name - " + Name+ " |" +
        "CodeP - " + CodeP + " |" +
        "Phone Number +" + Number + " |" +
        "Lease Term " + LeaseTerm + "mounth |" +
        '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(Name, people.Name) && Objects.equals(CodeP, people.CodeP) && Objects.equals(Number, people.Number) && Objects.equals(LeaseTerm, people.LeaseTerm);
    }
    @Override
    public int hashCode() { return Objects.hash( CodeP, Name, Number, LeaseTerm); }

    People(String Name1)
    {
        Name = Name1;
        Number= 3806676;
        LeaseTerm=36;
        CodeP=9529;
    }

    People()
    {
    }

    public People(String Name1, int Number1, int LeaseTerm1, int CodeP1)
    {   Name = Name1;
        Number= Number1;
        LeaseTerm=LeaseTerm1;
        CodeP=CodeP1;
    }

    public static class Builder{
        private People newPeople;

        public Builder(){ newPeople = new People(); }

        public Builder(String Name1)
        { newPeople = new People();
            newPeople.Name = Name1;
            newPeople.Number= 3806676;
            newPeople.LeaseTerm=35;
            newPeople.CodeP=9529;
        }

        public Builder(String Name, int Number, int LeaseTerm, int CodeP)
        { newPeople = new People();
            newPeople.Name = Name;
            newPeople.Number= Number;
            newPeople.LeaseTerm=LeaseTerm;
            newPeople.CodeP=CodeP;
        }
        public People.Builder withName(String Name){
            newPeople.Name = Name;
            return this;
        }

        public People.Builder withNumber(long Number){
            newPeople.Number = Number;
            return this;
        }

        public People.Builder withCodeP(long CodeP){
            newPeople.CodeP = CodeP;
            return this;
        }

        public People.Builder withLeaseTerm(int LeaseTerm){
            newPeople.LeaseTerm = LeaseTerm;
            return this;
        }


        public People build(){ return newPeople; }
    }
}
