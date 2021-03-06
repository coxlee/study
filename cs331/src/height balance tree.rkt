#lang racket
(define (depth t)
  (cond [(null? t) 0]
        [else (+ 1
                 (max (depth (tree-left t))
                      (depth (tree-right t))))]
        ))

(define (balance t)
  (cond [(null? t) 0]
        [else (- (depth (tree-left t))
                 (depth (tree-right t)))]
        ))

