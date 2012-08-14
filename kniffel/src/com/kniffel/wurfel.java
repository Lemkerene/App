package com.kniffel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wurfel extends Activity {
    /** Called when the activity is first created. */
	boolean btn1;
	boolean btn2;
	boolean btn3;
	boolean btn4;
	boolean btn5;
	int anzahl;
	public int spielernummer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wurfel);
        btn1 = true;
        btn2 = true;
        btn3 = true;
        btn4 = true;
        btn5 = true;
        anzahl = 1;
    }
    
    public void OnClickW(View v)
    {
    	
    	try {
    		if(anzahl<=3)
    		{
	    		if(btn1)
				{
	    			final Button b1;
	    			b1 = (Button) findViewById(R.id.wu1);
	    			b1.setText(gibZufallszahl(6));
				}
				
	    		if(btn2)
				{
	    			final Button b2;
	    			b2 = (Button) findViewById(R.id.wu2);
	    			b2.setText(gibZufallszahl(6));
				}
	    		
	    		if(btn3)
				{
	    			final Button b3;
	    			b3 = (Button) findViewById(R.id.wu3);
	    			b3.setText(gibZufallszahl(6));
				}
	    		if(btn4)
				{
	    			final Button b4;
	    			b4 = (Button) findViewById(R.id.wu4);
	    			b4.setText(gibZufallszahl(6));
				}
	    		
	    		if(btn5)
				{
	    			final Button b5;
	    			b5 = (Button) findViewById(R.id.wu5);
	    			b5.setText(gibZufallszahl(6));
				}
	    		anzahl++;
    		}
    		else
    		{
    			MyApp app = (MyApp) this.getApplicationContext();
    			app.setZahlen(GetZahlen());
				Intent in2 = new Intent(wurfel.this,blatt.class);
				startActivity(in2);
    		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    public int[] GetZahlen()
    {
    	int[] z= new int[5];
    	try {
			Button b = (Button) findViewById(R.id.wu1);
			String s = (String) b.getText();
			z[0] = Integer.parseInt(s);
			
			b = (Button) findViewById(R.id.wu2);
			s = (String) b.getText();
			z[1] = Integer.parseInt(s);
			
			b = (Button) findViewById(R.id.wu3);
			s = (String) b.getText();
			z[2] = Integer.parseInt(s);
			
			b = (Button) findViewById(R.id.wu4);
			s = (String) b.getText();
			z[3] = Integer.parseInt(s);
			
			b = (Button) findViewById(R.id.wu5);
			s = (String) b.getText();
			z[4] = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return z;
    }
    
    public void OnClickSperr(View v)
    {
    	switch(v.getId())
    	{
    	case R.id.wu1:
    		btn1 = !btn1;
    		break;
    	case R.id.wu2:
    		btn2 = !btn2;
    		break;
    	case R.id.wu3:
    		btn3 = !btn3;
    		break;
    	case R.id.wu4:
    		btn4 = !btn4;
    		break;
    	case R.id.wu5:
    		btn5 = !btn5;
    		break;
    	
    	}
    	
    }
    public String gibZufallszahl(int pMaximum) 
    {
        Integer i =(int) ((Math.random()*pMaximum)+1);
        return i.toString();
    }
}