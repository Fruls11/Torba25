import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

class TorbaTableModel extends DefaultTableModel {
    private final String[] columnNames = {"Tip", "Nosilnost/Kompaktna", "Število steklenic"};
    private final ArrayList<Torba> torbe;

    public TorbaTableModel() {
        super();
        torbe = new ArrayList<>();
        setColumnIdentifiers(columnNames);
    }

    public void dodajTorbo(Torba torba) {
        torbe.add(torba);
        Object[] rowData = {
            torba.getClass().getSimpleName(),
            (torba instanceof TorbaZaNakupovanje) ? ((TorbaZaNakupovanje) torba).getNosilnost() + " kg" : ((TorbaZaPiknik) torba).isKompaktna(),
            torba.steviloSteklenic()
        };
        addRow(rowData);
    }
}