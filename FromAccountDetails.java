public class FromAccountDetails extends StringToInput {

    /** From account details
     **/

    int    from_company;
    String from_prod_code,
           from_acc_number,
           from_acc_name,
           from_acc_reference,
           from_acc_description;
    double from_acc_amount;
    String from_acc_tran_code,
           from_acc_currency;

    /**Contructor
     *
     * @param from_acc_company
     * @param from_prod_code
     * @param from_acc_number
     * @param from_acc_name
     * @param from_acc_reference
     * @param from_acc_description
     * @param from_acc_amount
     * @param from_acc_tran_code
     * @param from_acc_currency
     */

    public FromAccountDetails(int from_acc_company, String from_prod_code, String from_acc_number, String from_acc_name, String from_acc_reference,
                              String from_acc_description, double from_acc_amount, String from_acc_tran_code, String from_acc_currency){

        setFrom_company(from_acc_company);
        setFrom_prod_code(from_prod_code);
        setFrom_acc_number(from_acc_number);
        setFrom_acc_name(from_acc_name);
        setFrom_acc_reference(from_acc_reference);
        setFrom_acc_description(from_acc_description);
        setFrom_acc_amount(from_acc_amount);
        setFrom_acc_tran_code(from_acc_tran_code);
        setFrom_acc_currency(from_acc_currency);
    }
    /** Set methods for the class
     */
    public void setFrom_company(int from_company) {
        this.from_company = from_company;
    }

    public void setFrom_prod_code(String from_prod_code) {
        this.from_prod_code = from_prod_code;
    }

    public void setFrom_acc_number(String from_acc_number) {
        this.from_acc_number = from_acc_number;
    }

    public void setFrom_acc_name(String from_acc_name) {
        this.from_acc_name = from_acc_name;
    }

    public void setFrom_acc_reference(String from_acc_reference) {
        this.from_acc_reference = from_acc_reference;
    }

    public void setFrom_acc_description(String from_acc_description) {
        this.from_acc_description = from_acc_description;
    }

    public void setFrom_acc_amount(double from_acc_amount) {
        this.from_acc_amount = from_acc_amount;
    }

    public void setFrom_acc_tran_code(String from_acc_tran_code) {
        this.from_acc_tran_code = from_acc_tran_code;
    }

    public void setFrom_acc_currency(String from_acc_currency) {
        this.from_acc_currency = from_acc_currency;
    }

    /** Return methods for the class
     */
    public int getFrom_company() {
        return from_company;
    }

    public String getFrom_prod_code() {
        return from_prod_code;
    }

    public String getFrom_acc_number() {
        return from_acc_number;
    }

    public String getFrom_acc_name() {
        return from_acc_name;
    }

    public String getFrom_acc_reference() {
        return from_acc_reference;
    }

    public String getFrom_acc_description() {
        return from_acc_description;
    }

    public double getFrom_acc_amount() {
        return from_acc_amount;
    }

    public String getFrom_acc_tran_code() {
        return from_acc_tran_code;
    }

    public String getFrom_acc_currency() {
        return from_acc_currency;
    }


}
