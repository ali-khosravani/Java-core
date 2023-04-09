package test.java.core;

import main.java.core.DataType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DataTypeTest {

    @Test
    void showVar() {
        DataType dataType = new DataType();
        dataType.setCheckedValue(true);
        Assertions.assertTrue(dataType.isCheckedValue());
    }
}