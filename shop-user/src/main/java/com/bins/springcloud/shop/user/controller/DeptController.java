package com.bins.springcloud.shop.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bins.springcloud.shop.common.vo.ResultVo;
import com.bins.springcloud.shop.user.dto.DeptDto;
import com.bins.springcloud.shop.user.dto.DeptPageDto;
import com.bins.springcloud.shop.user.service.DeptService;
import com.bins.springcloud.shop.user.vo.DeptVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	@GetMapping("/deptPagination")
	public ResultVo<PageInfo<DeptVo>> pageList(DeptPageDto pageDto) {
		PageInfo<DeptVo> pageInfo = deptService.getDeptPagination(pageDto);
		ResultVo<PageInfo<DeptVo>> result = new ResultVo<PageInfo<DeptVo>>();
		result.setData(pageInfo);
		return result;
	}
	
	@GetMapping("/detail")
	public ResultVo<DeptVo> detail(DeptDto dto) {
		DeptVo vo = deptService.getDetailById(dto);
		ResultVo<DeptVo> result = new ResultVo<DeptVo>();
		result.setData(vo);
		return result;
	}
	
	@RequestMapping("/deptEdit")
	public ResultVo<DeptVo> userEdit(@RequestBody DeptDto dto) {
		DeptVo deptVo = deptService.getById(dto.getId());
		deptService.updateDept(dto);
		ResultVo<DeptVo> result = new ResultVo<DeptVo>();
		result.setData(deptVo);
		return result;
	}
	
	@RequestMapping("/deptAdd")
	public ResultVo<DeptVo> userAdd(@RequestBody DeptDto dto) {
		if (dto.getSort() == null) {
			dto.setSort(0);
		}
		if (dto.getIsDel() == null) {
			dto.setIsDel(0);
		}
		if (dto.getPid() == null) {
			dto.setPid(0l);
		}
		dto.setCreateBy(1l);
		DeptVo vo = deptService.addNewDept(dto);
		ResultVo<DeptVo> result = new ResultVo<DeptVo>();
		result.setData(vo);
		return result;
	}
	
	@RequestMapping("/deptDel")
	@ResponseBody
	public ResultVo<Boolean> modelDel(DeptDto dto){
		if (dto.getId() == null || dto.getId() == 0) {
			return new ResultVo<Boolean>(1, "参数错误!", false);
		}
		return deptService.delDept(dto);
	}

}
