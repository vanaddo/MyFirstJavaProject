public class Main {

  public static void main(String [] args){


    ContactsManager myContactsManager = new ContactsManager();

    //Create new Contact objects & set the new object fields.

    Contact friendBob = new Contact();
    friendBob.name = "Bob";
    friendBob.email = "Bobsemail@somewhere.com";
    friendBob.phoneNumber = "5139896542";

    Contact friendJon = new Contact();
    friendJon.name = "Jon";
    friendJon.email = "Jonseamil@somewhere.com";
    friendJon.phoneNumber = "5134568787";

    Contact friendSam = new Contact();
    friendSam.name = "Sam";
    friendSam.email = "Samsemail@somwhere.com";
    friendSam.phoneNumber = "5138849595";

    Contact friendSue = new Contact();
    friendSue.name = "Sue";
    friendSue.email = "Suesemail@somewhere.com";
    friendSue.phoneNumber = "5136458787";


// add contacts to contact manager
    myContactsManager.addContact(friendBob);
    myContactsManager.addContact(friendJon);
    myContactsManager.addContact(friendSam);
    myContactsManager.addContact(friendSue);

//    search of a contact and display their phone number
    Contact result = myContactsManager.searchContact("Bob");
    System.out.println(result.phoneNumber);
  }
}
