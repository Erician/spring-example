package interfaces;

import objects.User;

public interface UserMapper {

    public void put (User user) throws DaoException;
    public Goods get(int goodsID) throws DaoException;
    public void delete(int goodsID) throws DaoException;
    public void updatePrice(@Param("goodsID")int goodsID, @Param("newPrice")float newPrice) throws DaoException;
}
