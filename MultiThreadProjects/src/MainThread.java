/**
 * 
 */

/**
 * @author suresh
 *
 */

//To created Thread
//extends Thread
//implements Runnable

/*
 * 
 * 
 * Task1Thread started Task2Thread started Task1 kicked on 101 102 103 104 105
 * 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 Main Thread is
 * completed 121 122 123 124 125 126 127 128 129 130 131 132 133 Task2 kicked on
 * 134 135 136 137 138 201 202 139 203 204 205 206 207 208 209 210 211 212 213
 * 214 215 216 217 218 219 220 221 222 223 140 141 142 143 144 145 146 147 148
 * 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167
 * 168 169 170 171 172 173 174 175 176 224 225 226 227 228 229 177 178 179 230
 * 231 232 233 234 235 236 180 181 182 237 238 239 240 241 242 243 244 245 246
 * 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265
 * 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284
 * 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 Task2 kicked off
 * 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 Task1
 * kicked off
 * 
 * 
 * Thread state:
 * 
 * NEW RUNNABLE RUNNING BLOCKED/WAITING TERMINATED/DEAD
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

class Task1 extends Thread {

	public void run() {
		System.out.println("Task1 kicked on");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("Task1 kicked off");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Task2 kicked on");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("Task2 kicked off");
	}

}

public class MainThread {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Task1Thread started");
		Task1 task1thread = new Task1();
		task1thread.setPriority(10);
		task1thread.start();
		// wait for task1thread to complete it's execution before starting task2thread
		task1thread.join();
		System.out.println("Task2Thread started");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		// wait for task2thread to complete it's execution before main thread
		task2thread.join();

		System.out.println("Main Thread is completed");

	}

}
