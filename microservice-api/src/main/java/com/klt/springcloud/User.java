package com.klt.springcloud;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -7386632612577124607L;
    private Integer id;
    private String name;
}

