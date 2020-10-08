package cn.action.common.persistence;

import java.util.List;


public interface CrudDao<T> extends BaseDao {

	/**
	 * ��ȡ��������
	 * @param id
	 * @return
	 */
	public T get(String id);
	/**
	 * ��ȡ��������
	 * @param entity
	 * @return
	 */
	public T get(T entity);
	
	/**
	 * ��ѯ�����б������Ҫ��ҳ�������÷�ҳ�����磺entity.setPage(new Page<T>());
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * ��ѯ���������б�
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity);
	/**
	 * ��������
	 * @param entity
	 * @return
	 */
	public int insert(T entity);
	/**
	 * ��������
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	
	/**
	 * ɾ�����ݣ�һ��Ϊ�߼�ɾ��������del_flag�ֶ�Ϊ1��
	 * @param entity
	 * @return
	 */
	public int delete(T entity);
	public List<T> findYearList(T entity);
	public List<T> findMonthList(T entity);
	public List<T> findWeekList(T entity);

}
