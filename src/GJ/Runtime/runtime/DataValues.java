package Runtime.runtime;

public class DataValues {

    private final Object value;

    DataValues(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInt() {
        return (Integer)value;
    }

    public String getDataType() {
        try {
            int i = (Integer)value;
            return "Integer";
        }catch (ClassCastException e) {
            return "Boolean";
        }


    @Override
    public int hashCode() {
        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        DataValues that = (DataValues)o;
        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}