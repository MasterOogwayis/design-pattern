package com.zsw.design.template.iextends;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author Shaowei Zhang on 2019/3/17 16:44
 **/
@AllArgsConstructor
public abstract class BaseRepository<T> {

    public List<T> executeQuery(String sql, Object[] values) {

        Connection connection = this.getConnection();

        PreparedStatement ps = this.createPreparedStatement(sql, connection);

        ResultSet rs = this.executeQuery(ps, values);

        List<T> list = this.convertToEntity(rs);

        this.closeConnection(connection);
        this.closePreparedStatement(ps);
        this.closeResultSet(rs);
        return list;

    }

    protected abstract List<T> convertToEntity(ResultSet rs);

    @SneakyThrows
    protected ResultSet executeQuery(PreparedStatement ps, Object[] values) {
        if (values != null && values.length > 0) {
            for (int i = 0; i < values.length; i++) {
                ps.setObject(i, values[0]);
            }
        }
        return ps.executeQuery();
    }

    ;

    @SneakyThrows
    protected PreparedStatement createPreparedStatement(String sql, Connection connection) {
        return connection.prepareStatement(sql);
    }

    ;

    protected abstract Connection getConnection();

    @SneakyThrows
    protected void closeConnection(Connection connection) {
        connection.close();
    }

    @SneakyThrows
    protected void closePreparedStatement(PreparedStatement ps) {
        ps.close();
    }

    @SneakyThrows
    protected void closeResultSet(ResultSet rs) {
        rs.close();
    }

}
