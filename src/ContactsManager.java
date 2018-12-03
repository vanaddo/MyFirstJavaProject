public class ContactsManager {
  //Fields:
  Contact [] myFriends;
  int friendsCount;

  //Default Constructor that will initialize the fields:
  ContactsManager() {
    this.friendsCount = 0;
    this.myFriends = new Contact[500];
  }

  //class methods:

  void addContact(Contact contact){
    myFriends[friendsCount] = contact;
    friendsCount++;
  }

  Contact searchContact(String searchName){
    for(int i = 0; i <friendsCount; ++){
      if(myFriends[i].name.equals(searchName)){
        return myFriends[i];
      }
    }
    return null;
  }
}