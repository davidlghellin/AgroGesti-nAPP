/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 *
 * @author david
 */
public class DisposicionEnColumnas implements LayoutManager
{

	@Override
	public void addLayoutComponent(String name, Component comp)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void layoutContainer(Container parent)
	{
		int pixel = parent.getWidth();
		int n = parent.getComponentCount();
		int y = 0;
		
		for (int i = 0; i < n; i++)
		{
			if (i % 2 == 0)
				parent.getComponent(i).setBounds((pixel - 150) / 2, y, 150, 20);
			else
			{
				parent.getComponent(i).setBounds((pixel ) / 2, y, 150, 20);
				y+=20;
			}
		}

	}

	@Override
	public Dimension minimumLayoutSize(Container parent)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp)
	{
		// TODO Auto-generated method stub

	}

}