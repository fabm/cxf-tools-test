
package org.example;

import javax.jws.WebService;


@WebService
public interface ICalculator {

    Integer add(Integer a, Integer b);

    Integer subtract(Integer a, Integer b);

}
