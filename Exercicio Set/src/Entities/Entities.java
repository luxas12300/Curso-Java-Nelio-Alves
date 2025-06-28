package Entities;

import java.util.Objects;

public class Entities {
    private int code;

    public Entities(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entities entities = (Entities) o;
        return code == entities.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
