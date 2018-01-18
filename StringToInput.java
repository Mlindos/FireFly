
/**Author: Linda Ndabana
 * Package: SmartBlock
 * This class will break an input string that is pipe delimited into string array and allocate to relevant fields
 *
 * Data will come in a pie delimited format
 */

public class StringToInput {

       String batch_type,
              set_type;

    /**Default Contructor
     */
    public StringToInput(){}

    /**Constructor
     * @param batch_type
     * @param set_type
     */
     public StringToInput(String batch_type, String set_type){
        setBatch_type(batch_type);
        setSet_type(set_type);
    }

    public String getBatch_type() {
        return batch_type;
    }

    public void setBatch_type(String batch_type) {
        this.batch_type = batch_type;
    }

    public void setSet_type(String set_type) {
        this.set_type = set_type;
    }

    public String getSet_type() {
        return set_type;
    }

}
