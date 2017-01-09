package com.hello.main.starter;

public enum STATUS {

	SUCCESS {
		@Override
		public String toString() {
			return "Succeeded";
		}
	},
	FAIL {
		@Override
		public String toString() {
			return "Failed";
		}
	},
	ALLREADY_EXIST {
		@Override
		public String toString() {
			return "Already exists";
		}
	},
	IN_PROGRESS {
		@Override
		public String toString() {
			return "In progress";
		}
	},
	DENIED {
		@Override
		public String toString() {
			return "Denied";
		}
	},
	NEW {
		@Override
		public String toString() {
			return "New";
		}
	}
}
