/** To account details
 **/

public class ToAccountDetails extends StringToInput {

    int    home_acc_company;
    String home_acc_product,
           home_acc_type;
    int    home_acc_branch;
    String home_acc_number;
    int    home_acc_budget_no;
    String home_acc_account_name;
    double home_acc_homing_amount;
    String home_acc_currency;
    String home_acc_tran_code;


    /**Contructor
     *
     * @param home_acc_company
     * @param home_acc_product
     * @param home_acc_type
     * @param home_acc_branch
     * @param home_acc_number
     * @param home_acc_budget_no
     * @param home_acc_account_name
     * @param home_acc_homing_amount
     * @param home_acc_currency
     * @param home_acc_tran_code
     */

    public ToAccountDetails(int home_acc_company, String home_acc_product, String home_acc_type, int home_acc_branch, String home_acc_number,
                            int home_acc_budget_no, String home_acc_account_name, double home_acc_homing_amount, String home_acc_currency,
                            String home_acc_tran_code){

        setHome_acc_company(home_acc_company);
        setHome_acc_product(home_acc_product);
        setHome_acc_type(home_acc_type);
        setHome_acc_branch(home_acc_branch);
        setHome_acc_number(home_acc_number);
        setHome_acc_budget_no(home_acc_budget_no);
        setHome_acc_account_name(home_acc_account_name);
        setHome_acc_homing_amount(home_acc_homing_amount);
        setHome_acc_currency(home_acc_currency);
        setHome_acc_tran_code(home_acc_tran_code);

    }
    /** Setter methods
     */
    public void setHome_acc_company(int home_acc_company) {
        this.home_acc_company = home_acc_company;
    }

    public void setHome_acc_product(String home_acc_product) {
        this.home_acc_product = home_acc_product;
    }

    public void setHome_acc_type(String home_acc_type) {
        this.home_acc_type = home_acc_type;
    }

    public void setHome_acc_branch(int home_acc_branch) {
        this.home_acc_branch = home_acc_branch;
    }

    public void setHome_acc_number(String home_acc_number) {
        this.home_acc_number = home_acc_number;
    }

    public void setHome_acc_budget_no(int home_acc_budget_no) {
        this.home_acc_budget_no = home_acc_budget_no;
    }

    public void setHome_acc_account_name(String home_acc_account_name) {
        this.home_acc_account_name = home_acc_account_name;
    }

    public void setHome_acc_currency(String home_acc_currency) {
        this.home_acc_currency = home_acc_currency;
    }

    public void setHome_acc_homing_amount(double home_acc_homing_amount) {
        this.home_acc_homing_amount = home_acc_homing_amount;
    }

    public void setHome_acc_tran_code(String home_acc_tran_code) {
        this.home_acc_tran_code = home_acc_tran_code;
    }

    /** Getter methods
     * @return
     */
    public int getHome_acc_company() {
        return home_acc_company;
    }

    public String getHome_acc_product() {
        return home_acc_product;
    }

    public String getHome_acc_type() {
        return home_acc_type;
    }

    public int getHome_acc_branch() {
        return home_acc_branch;
    }

    public String getHome_acc_number() {
        return home_acc_number;
    }

    public int getHome_acc_budget_no() {
        return home_acc_budget_no;
    }

    public String getHome_acc_account_name() {
        return home_acc_account_name;
    }

    public double getHome_acc_homing_amount() {
        return home_acc_homing_amount;
    }

    public String getHome_acc_currency() {
        return home_acc_currency;
    }

    public String getHome_acc_tran_code() {
        return home_acc_tran_code;
    }

    //Any code to check what I can do with the to account number
    //Can check account age here???, I would need the date account set if DDA
    //Can we check High sub product code here????
}
