import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankDatabase {
    private List<ClientAccount> listClientAccounts = new ArrayList<>();

    public void addClient(ClientAccount clientAccount){
        listClientAccounts.add(clientAccount);
    }

    public List<ClientAccount> getListClientAccounts() {
        return Collections.unmodifiableList(listClientAccounts);
    }
}
