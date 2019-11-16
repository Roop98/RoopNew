package entities;

import entities.Tables;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "ACTIVE")
    private int active;

    @Column(name = "STARTEDON")
    private Timestamp startedon;

    @ManyToOne
    @JoinColumn(name = "tableid", nullable = false)
    private Tables tables;

    public Orders() {
    }

    public Orders(int active, Timestamp startedon) {
        this.active = active;
        this.startedon = startedon;
    }

    public Orders(int active, Timestamp startedon, Tables tables) {
        this.active = active;
        this.startedon = startedon;
        this.tables = tables;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Timestamp getStartedon() {
        return startedon;
    }

    public void setStartedon(Timestamp startedon) {
        this.startedon = startedon;
    }

    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }
}
