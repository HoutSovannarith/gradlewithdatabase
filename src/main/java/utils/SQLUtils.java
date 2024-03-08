package utils;

public class SQLUtils {
    public  static class PersonSQL{

        // all constant must in uppercase
        public static final String getAllPersonSql= """
            select * from tbl_person;
            """;
        public static final String insertNewPerson= """
                INSERT INTO tbl_person ("name","gender","email","address") VALUES(?,?,?,?);
                """;

        public  static final String deletePersonById = """
                delete from tbl_person where id = ?
                """;

        public  static final String updatePerson= """
                update tbl_person set  name=?,gender=?,email=?,address=?
                where id = ?
                """;
    }
    public  static class SystemUser{
        // sql string in here !
    }
}
