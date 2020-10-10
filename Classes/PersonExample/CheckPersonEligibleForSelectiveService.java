package Classes.PersonExample;

class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}

// to invoke method create a new instance of class Person then invoke print persons 
//newPerosn.printPersons(roster, new CheckPersonEligibleForSelectiveService());