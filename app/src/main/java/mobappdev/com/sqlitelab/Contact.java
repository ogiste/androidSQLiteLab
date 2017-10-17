package mobappdev.com.sqlitelab;

/**
 * Created by Alfred on 17/10/2017.
 */
public class Contact {
    int _id;
    String _name;
    String _phone_number;


    //public
    public Contact(){

    }

    //constructor

    public Contact(int id, String name, String phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = phone_number;


    }

    public Contact(String name, String phone_number){
        this._name= name;
        this._phone_number=phone_number;

    }

    public int getID(){
        return this._id;
    }

    public void setID(int _id) {
        this._id = _id;
    }

    public String getName() {
        return this._name;
    }

    public String getPhoneNumber() {
        return this._phone_number;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setPhoneNumber(String _phone_number) {
        this._phone_number = _phone_number;
    }
}
