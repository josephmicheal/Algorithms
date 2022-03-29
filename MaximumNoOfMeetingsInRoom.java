package com.tried.off;
import java.util.ArrayList;
import java.util.List;

public class MaximumNoOfMeetingsInRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 5, 7, 9, 9 };

		List<Meeting> list = new ArrayList<>();
		

		for (int i = 0; i < start.length; i++) {
			list.add(new Meeting(start[i],end[i]));
		}
		
		list.sort((a,b)-> a.duration - b.duration);
		
		System.out.println(list);
	}

}

class Meeting {
	int start;
	int end;
	int duration;

	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
		duration = end - start;
	}

	@Override
	public String toString() {
		return start+" : "+end+" > "+ duration;
	}
}

