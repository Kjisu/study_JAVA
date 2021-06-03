package ch15;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class PipedReaderWriter {

	public static void main(String[] args) {
		
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		// PipedReader와 PipedWriter 연결
		inThread.connect(outThread.getOutput());
		
		inThread.start();
		outThread.start();
	}

}

class InputThread extends Thread{
	
	// 데이터 읽어오는 스트림 생성
	PipedReader input = new PipedReader();
	// 버퍼 생성
	StringWriter sw = new StringWriter();
	
	public InputThread(String name) {
		super(name);
	}
	
	public void run() {
		
		int data = 0;
		
		try {
			while((data=input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(this.getName() +" received : "+sw.toString()); // StringWriter버퍼에 잇는 내용을 String으로 바꿔서 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public PipedReader getInput() {
		return input;
	}
	
	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//connect()
	
	
}

class OutputThread extends Thread{
	
	// 출력 인스턴스 생성
	PipedWriter output = new PipedWriter();
	
	public OutputThread(String name) {
		super(name);
	}
	
	public void run() {
		
		try {
			String msg = "Hello";
			System.out.println(this.getName()+" sent : "+msg);
			output.write(msg);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//run()
	
	public PipedWriter getOutput() {
		return output;
	}
	
	public void connect(PipedReader input) {
		try {
			output.connect(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//connect()
	
	
}
