public interface IEntityRepository <T extends IEntity>  {
    void insert(T object);
    void update(T object);
    void delete(T object);
}
