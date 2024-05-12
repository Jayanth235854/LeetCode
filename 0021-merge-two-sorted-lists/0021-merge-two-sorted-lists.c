struct Node {
  int data;
  struct Node* next;
};

struct Node* mergeTwoLists(struct Node* list1, struct Node* list2) {
  struct Node* dummy = malloc(sizeof(struct Node));
  dummy->next = NULL;

  struct Node* current = dummy;
  while (list1 != NULL && list2 != NULL) {
    if (list1->data <= list2->data) {
      current->next = list1;
      list1 = list1->next;
    } else {
      current->next = list2;
      list2 = list2->next;
    }
    current = current->next;
  }

  if (list1 != NULL) {
    current->next = list1;
  } else {
    current->next = list2;
  }

  return dummy->next;
}