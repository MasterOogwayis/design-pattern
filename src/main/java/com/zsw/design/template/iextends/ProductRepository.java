package com.zsw.design.template.iextends;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shaowei Zhang on 2019/3/17 16:50
 **/
@Data
@AllArgsConstructor
public class ProductRepository extends BaseRepository<Product> {

    private DataSource dataSource;

    public List<Product> findAll() {
        return this.executeQuery("select * from t_product", null);
    }

    @Override
    @SneakyThrows
    protected List<Product> convertToEntity(ResultSet rs) {
        List<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product pr = Product.builder()
                    .id(rs.getLong("id"))
                    .desc(rs.getString("desc"))
                    .name(rs.getString("name"))
                    .number(rs.getInt("number"))
                    .build();
            list.add(pr);
        }
        return list;
    }

    @Override
    @SneakyThrows
    protected Connection getConnection() {
        return this.dataSource.getConnection();
    }
}
