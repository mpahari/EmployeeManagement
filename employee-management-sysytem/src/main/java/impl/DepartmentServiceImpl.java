package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.DepartmentDto;
import com.springboot.entities.Department;
import com.springboot.repository.DepartmentRepository;
import com.springboot.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		Department entity = new Department();
		entity.setId(departmentDto.getId());
		entity.setName(departmentDto.getName());
		entity.setShortCode(departmentDto.getShortCode());
		entity.setStatus(departmentDto.getStatus());
		entity = departmentRepository.save(entity);
		
		
		return DepartmentDto.builder()
				.id(entity.getId())
				.name(entity.getName())
				.shortCode(entity.getShortCode())
				.status(entity.getStatus())
				.build();
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentDto findByid(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentById(Integer Id) {
		// TODO Auto-generated method stub
		
	}

}
