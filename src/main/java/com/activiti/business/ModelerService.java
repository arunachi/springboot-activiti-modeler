package com.activiti.business;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ModelerService {
    void modeler(HttpServletRequest request, HttpServletResponse response) throws IOException;

    void deployment(String modelId) throws IOException;
}
