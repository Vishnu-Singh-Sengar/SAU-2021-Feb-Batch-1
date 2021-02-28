package com.springassign;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Rectangle {
	
	@Autowired
    @Qualifier("points")
    private List<Point> points;

    @Autowired
    @Qualifier("pointA")
    private Point pointA;

    @Autowired
    @Qualifier("pointB")
    private Point pointB;

    @Autowired
    @Qualifier("pointC")
    private Point pointC;

    @Autowired
    @Qualifier("pointD")
    private Point pointD;

    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public List<Point> getPoints(){
		return points;
	}
	
	public void setPoints(List<Point> points){
		this.points = points;
	}

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
	public void draw() {
        System.out.println("\n\n-----------------------Drawing Successful-------------------\n\nHeight: "+getHeight()+"\nWidth: "+getWidth()+"\n");
        
        System.out.println("Coordinates:\n");
        System.out.println("A: ("+pointA.getX()+","+pointA.getY()+")");
        System.out.println("B: ("+pointB.getX()+","+pointB.getY()+")");
        System.out.println("C: ("+pointC.getX()+","+pointC.getY()+")");
        System.out.println("D: ("+pointD.getX()+","+pointD.getY()+")");
        
        System.out.println("\nCoordinates via use of Lists :\n");
        int ccount=0;
        for(Point point:points) {
			System.out.println("Coordinate - "+ccount+": ("+point.getX()+","+point.getY()+")");
		}
    }
}


/*
 * For Accolite University,
 * 
 * Vishnu Singh Sengar
 */
