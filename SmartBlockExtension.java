
/** Smartblock related data input.. This can be called smartblock extension area
 **/

public class SmartBlockExtension extends StringToInput {

    String smb_payment_type;
    int    smb_cust_link_date;
    String smb_neps_company,
           smb_neps_relation,
           smb_neps_zap_number;
    int    smb_neps_seq_number,
           smb_neps_date,
           smb_neps_date_acc_change;
    char   smb_ip_address_flag,
           smb_cookie_flag,
           smb_route_to_ocs;
    int    smb_logon_score,
           smb_transaction_score,
           smb_schedule_due_date;
    String smb_route_to_ocs_reason;
    int    smb_pair_date,
           smb_swap_date;
    char   smb_user_type;


    /**contructor
     *
     * @param smb_payment_type
     * @param smb_cust_link_date
     * @param smb_neps_company
     * @param smb_neps_relation
     * @param smb_neps_zap_number
     * @param smb_neps_seq_number
     * @param smb_neps_date
     * @param smb_neps_date_acc_change
     * @param smb_ip_address_flag
     * @param smb_cookie_flag
     * @param smb_route_to_ocs
     * @param smb_logon_score
     * @param smb_transaction_score
     * @param smb_schedule_due_date
     * @param smb_route_to_ocs_reason
     * @param smb_pair_date
     * @param smb_swap_date
     * @param smb_user_type
     */
    public SmartBlockExtension(String smb_payment_type, int smb_cust_link_date, String smb_neps_company, String smb_neps_relation, String smb_neps_zap_number,
                               int smb_neps_seq_number, int smb_neps_date, int smb_neps_date_acc_change, char smb_ip_address_flag, char smb_cookie_flag,
                               char smb_route_to_ocs, int smb_logon_score, int smb_transaction_score, int smb_schedule_due_date, String smb_route_to_ocs_reason,
                               int smb_pair_date, int smb_swap_date, char smb_user_type){

      setSmb_payment_type(smb_payment_type);
      setSmb_cust_link_date(smb_cust_link_date);
      setSmb_neps_company(smb_neps_company);
      setSmb_neps_relation(smb_neps_relation);
      setSmb_neps_zap_number(smb_neps_zap_number);
      setSmb_neps_seq_number(smb_neps_seq_number);
      setSmb_neps_date(smb_neps_date);
      setSmb_neps_date_acc_change(smb_neps_date_acc_change);
      setSmb_ip_address_flag(smb_ip_address_flag);
      setSmb_cookie_flag(smb_cookie_flag);
      setSmb_route_to_ocs(smb_route_to_ocs);
      setSmb_logon_score(smb_logon_score);
      setSmb_transaction_score(smb_transaction_score);
      setSmb_schedule_due_date(smb_schedule_due_date);
      setSmb_route_to_ocs_reason(smb_route_to_ocs_reason);
      setSmb_pair_date(smb_pair_date);
      setSmb_swap_date(smb_swap_date);
      setSmb_user_type(smb_user_type);

    }
    /**Setter methods
     *
     */

    public void setSmb_payment_type(String smb_payment_type) {
        this.smb_payment_type = smb_payment_type;
    }

    public void setSmb_cust_link_date(int smb_cust_link_date) {
        this.smb_cust_link_date = smb_cust_link_date;
    }

    public void setSmb_neps_company(String smb_neps_company) {
        this.smb_neps_company = smb_neps_company;
    }

    public void setSmb_neps_relation(String smb_neps_relation){
        this.smb_neps_relation = smb_neps_relation;
    }

    public void setSmb_neps_zap_number(String smb_neps_zap_number){
        this.smb_neps_zap_number = smb_neps_zap_number;
    }
    public void setSmb_neps_seq_number(int smb_neps_seq_number) {
        this.smb_neps_seq_number = smb_neps_seq_number;
    }

    public void setSmb_neps_date(int smb_neps_date) {
        this.smb_neps_date = smb_neps_date;
    }

    public void setSmb_neps_date_acc_change(int smb_neps_date_acc_change) {
        this.smb_neps_date_acc_change = smb_neps_date_acc_change;
    }

    public void setSmb_ip_address_flag(char smb_ip_address_flag) {
        this.smb_ip_address_flag = smb_ip_address_flag;
    }

    public void setSmb_cookie_flag(char smb_cookie_flag) {
        this.smb_cookie_flag = smb_cookie_flag;
    }

    public void setSmb_route_to_ocs(char smb_route_to_ocs) {
        this.smb_route_to_ocs = smb_route_to_ocs;
    }

    public void setSmb_logon_score(int smb_logon_score) {
        this.smb_logon_score = smb_logon_score;
    }

    public void setSmb_transaction_score(int smb_transaction_score) {
        this.smb_transaction_score = smb_transaction_score;
    }

    public void setSmb_schedule_due_date(int smb_schedule_due_date) {
        this.smb_schedule_due_date = smb_schedule_due_date;
    }

    public void setSmb_route_to_ocs_reason(String smb_route_to_ocs_reason) {
        this.smb_route_to_ocs_reason = smb_route_to_ocs_reason;
    }

    public void setSmb_pair_date(int smb_pair_date) {
        this.smb_pair_date = smb_pair_date;
    }

    public void setSmb_swap_date(int smb_swap_date) {
        this.smb_swap_date = smb_swap_date;
    }

    public void setSmb_user_type(char smb_user_type) {
        this.smb_user_type = smb_user_type;
    }

    /** Getter methods
     */
    public String getSmb_payment_type() {
        return smb_payment_type;
    }

    public int getSmb_cust_link_date() {
        return smb_cust_link_date;
    }

    public String getSmb_neps_company() {
        return smb_neps_company;
    }

    public String getSmb_neps_relation() {
        return smb_neps_relation;
    }

    public String getSmb_neps_zap_number() {
        return smb_neps_zap_number;
    }

    public int getSmb_neps_seq_number() {
        return smb_neps_seq_number;
    }

    public int getSmb_neps_date() {
        return smb_neps_date;
    }

    public int getSmb_neps_date_acc_change() {
        return smb_neps_date_acc_change;
    }

    public char getSmb_ip_address_flag() {
        return smb_ip_address_flag;
    }

    public char getSmb_cookie_flag() {
        return smb_cookie_flag;
    }

    public char getSmb_route_to_ocs() {
        return smb_route_to_ocs;
    }

    public int getSmb_logon_score() {
        return smb_logon_score;
    }

    public int getSmb_transaction_score() {
        return smb_transaction_score;
    }

    public int getSmb_schedule_due_date() {
        return smb_schedule_due_date;
    }

    public String getSmb_route_to_ocs_reason() {
        return smb_route_to_ocs_reason;
    }

    public int getSmb_pair_date() {
        return smb_pair_date;
    }

    public int getSmb_swap_date() {
        return smb_swap_date;
    }

    public char getSmb_user_type() {
        return smb_user_type;
    }

    //Code to check transaction scores
    //code to check ocs flags
    //Should I check TurnOver rule in this class code?? [String that occurs 10], break the turnover sting into an array of 20 occurances..
    //What do I do with the swap dates, pair dates, schedule payment dates
    // Code for types of payment
    // Code for once-off payment,
    // Code for payment links
    // Code for schedule payment
    //Code for high sub product here??
}

