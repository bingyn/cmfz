package com.baizhi.wsf.dto;

import com.baizhi.wsf.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-20 16:04
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BannerDto implements Serializable {
    private Integer total;
    private List<Banner> rows;
}
    