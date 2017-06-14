package com.example;

import com.trianglechecker.domain.Triangle;
import com.trianglechecker.domain.TriangleType;
import com.trianglechecker.process.Checker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Created by Sergey Shushkov on 11.06.2017.
 * ClearScale Java Team
 *
 * Main app class
 */
public class TriangleChecker {

    private static  final Logger logger = LoggerFactory.getLogger(TriangleChecker.class);


    public static void main(String[] args) {
        if (args.length<3) {
            logger.error("Please pass triangle edge length as arguments");
        } else if (args.length>3) {
            logger.error("Too match arguments");
        } else {

            try {
                Double a = Double.valueOf(args[0]);
                Double b = Double.valueOf(args[1]);
                Double c = Double.valueOf(args[2]);

                Triangle triangle = new Triangle(a, b, c);

                TriangleType triangleType = Checker.checking(triangle);

                triangle.setType(triangleType);

                switch (triangleType) {
                    case EQUILATERAL:
                        logger.info("this triangle is equilateral");
                        break;
                    case ISOSCELES:
                        logger.info("this triangle is isosceles");
                        break;
                    case SCALENE:
                        logger.info("this triangle is scalene");
                        break;
                }
            } catch (IllegalArgumentException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }
}
