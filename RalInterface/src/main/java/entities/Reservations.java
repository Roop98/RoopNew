package entities;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "RESERVATIONS")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TIME")
    private Timestamp time;

    @Column(name = "COUNT")
    private int count;

    @OneToOne
    @JoinColumn(name = "table_id")
    private Tables tables;


    public Reservations(String customerName, Timestamp timestamp, int peopleCount) {
        this.count = peopleCount;
        this.name = customerName;
        this.time = timestamp;
    }

    public Reservations(String name, Timestamp time, int count, Tables tables) {
        this.name = name;
        this.time = time;
        this.count = count;
        this.tables = tables;
    }

    public Reservations() {

    }

    public void setTableId(int tableId) {
        this.id = tableId;
    }

    public int getTableId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tables getTables() {
        return tables;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}

