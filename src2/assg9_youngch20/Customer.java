/**
 * Charles Young
 */
package assg9_youngch20;

import activity12.KeyedItem;
/**
 * 
 * @author Charles Young
 *
 */
public class Customer extends KeyedItem<String> {

    private String name;
    private String phoneNumber;

    public Customer(String id, String name, String phoneNumber){
        super(id);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
/**
 * gets name
 * @return
 */
    public String getName(){
        return name;
    }
/**
 * gets phone number
 * @return
 */
    public String getPhone(){
        return phoneNumber;
    }
/**
 * sets name
 * @param name
 */
    public void setName(String name){
        this.name = name;
    }
/**
 * sets the phone number
 * @param phoneNumber
 */
    public void setPhone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}

