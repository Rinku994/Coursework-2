import static org.junit.jupiter.api.Assertions.*;
import java.sql.Statement;
import org.junit.jupiter.api.Test;
public class ConnectionTesting {
	@Test
    void test() {
        DbConnection db = new DbConnection();
        Statement AO = db.connection();
        assertEquals(null, AO);
   
    }

}
