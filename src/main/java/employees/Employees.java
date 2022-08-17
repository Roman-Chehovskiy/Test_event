package employees;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employees {

    String name;
    LocalDate date_r;
    LocalDate date_work;

    public String getName() {
        return name;
    }

    public Employees setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDate_r() {
        return date_r;
    }

    public Employees setDate_r(LocalDate date_r) {
        this.date_r = date_r;
        return this;
    }

    public LocalDate getDate_work() {
        return date_work;
    }

    public Employees setDate_work(LocalDate date_work) {
        this.date_work = date_work;
        return this;
    }
}
