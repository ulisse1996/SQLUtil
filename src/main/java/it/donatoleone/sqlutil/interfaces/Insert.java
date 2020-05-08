package it.donatoleone.sqlutil.interfaces;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public interface Insert extends SqlQuery {

    InsertingValue insert(String column);
    void execute(DataSource dataSource) throws SQLException;
    void execute(Connection connection) throws SQLException;
}
