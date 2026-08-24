"use client"
import { useState, type ReactNode } from 'react'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'


const QueryProvider = ({ children }: { children: ReactNode }) => {
  const [query,setQuery] = useState(() => new QueryClient())

  return (
    <QueryClientProvider client={query}>
      {children}
    </QueryClientProvider>
  )
}

export default QueryProvider;