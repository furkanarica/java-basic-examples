public interface IEntityRepository<T extends IEntity> {
    void create(T entity);
    void delete(T entity);
    void update(T entity);
}
