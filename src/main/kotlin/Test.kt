import org.example.convertValue
import org.testng.Assert
import org.testng.annotations.Test

class ConverterTest {

    @Test
    fun testConvertValue_validOutput() {
        val result = convertValue(3, 4, 1.0)
        Assert.assertEquals(result, 100.0)
    }

    @Test
    fun testConvertValue_invalidOutput() {
        val result = convertValue(3, 3, 1.0)
        Assert.assertNotEquals(result, 10.0)
    }

}
